package shoshin.alex.tutusoap.controllers;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shoshin.alex.tutusoap.services.Terminal;
import shoshin.alex.tutusoap.services.TerminalService;
import shoshin.alex.tutusoap.utils.DateFactory;

@Controller
public class TerminalController {
    Terminal terminal;
    
    public TerminalController() {
        terminal = (new TerminalService()).getTerminalPort();
    }
    
    @RequestMapping(value = "/terminal", params = {"name",
                                                   "surname",
                                                   "patronymic",
                                                   "birthDay", "birthMonth", "birthYear",
                                                   "departurePoint",
                                                   "departureDay", "departureMonth", "departureYear", "departureHours", "departureMinutes",
                                                   "destinationPoint",
                                                   "destinationDay", "destinationMonth", "destinationYear", "destinationHours", "destinationMinutes"})
    public String reserveTicket(Model model,
                              @RequestParam String name,
                              @RequestParam String surname,
                              @RequestParam String patronymic,
                              @RequestParam int birthDay,
                              @RequestParam int birthMonth,
                              @RequestParam int birthYear,
                              @RequestParam String departurePoint,
                              @RequestParam int departureDay,
                              @RequestParam int departureMonth,
                              @RequestParam int departureYear,
                              @RequestParam int departureHours,
                              @RequestParam int departureMinutes,
                              @RequestParam String destinationPoint,
                              @RequestParam int destinationDay,
                              @RequestParam int destinationMonth,
                              @RequestParam int destinationYear,
                              @RequestParam int destinationHours,
                              @RequestParam int destinationMinutes) throws DatatypeConfigurationException {
        int ticketId = terminal.reserveTicket(name,
                                              surname,
                                              patronymic,
                                              DateFactory.newDate(birthYear, birthMonth, birthDay),
                                              departurePoint,
                                              destinationPoint,
                                              DateFactory.newDate(departureYear, departureMonth, departureDay, departureHours, departureMinutes),
                                              DateFactory.newDate(destinationYear, destinationMonth, destinationDay, destinationHours, destinationMinutes));
        model.addAttribute("reservation", "ticket number " + ticketId + " reserved to " + name + " " + surname);
        return getTerminalPage(model);
    }
    
    @RequestMapping(value = "/terminal")
    public String getTerminalPage(Model model) {
        return "terminal";
    }
}