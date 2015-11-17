package shoshin.alex.tutusoap.controllers;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shoshin.alex.tutusoap.services.AlreadyPaidException_Exception;
import shoshin.alex.tutusoap.services.Terminal;
import shoshin.alex.tutusoap.services.TerminalService;
import shoshin.alex.tutusoap.services.Ticket;
import shoshin.alex.tutusoap.services.TicketDoesNotExistException_Exception;
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
        model.addAttribute("resultInfo", "ticket number " + ticketId + " reserved to " + name + " " + surname);
        model.addAttribute("ticketId", ticketId);
        return getTerminalPage(model);
    }
    
    @RequestMapping(value = "/terminal", params = {"getTicket"})
    public String getTicket(Model model, @RequestParam(value = "getTicket") int ticketId) {
        Ticket ticket = terminal.getTicket(ticketId);
        
        model.addAttribute("resultInfo", "passenger - " + ticket.getPassenger().getName() + " " + ticket.getPassenger().getSurname()
                                         + ", departure - " + ticket.getDeparturePoint() + " " + ticket.getDepartureTime()
                                         + ", destination - " + ticket.getDeparturePoint() + " " + ticket.getDestinationTime()
                                         + ", price - " + ticket.getPrice().getCount() + ticket.getPrice().getCurrency().name()
                                         + ", status - " + ticket.getStatus().name());
        model.addAttribute("ticketId", ticketId);
        return getTerminalPage(model);
    }
    
    @RequestMapping(value = "/terminal", params = {"payForTicket"})
    public String payForTicket(Model model, @RequestParam(value = "payForTicket") int ticketId) {
        try {
            terminal.payForTicket(ticketId);
            model.addAttribute("resultInfo", "seccessfully paid");
            model.addAttribute("ticketId", ticketId);
        } catch (AlreadyPaidException_Exception e) {
            model.addAttribute("resultInfo", "you can't pay twise");
            model.addAttribute("ticketId", ticketId);
        } catch (TicketDoesNotExistException_Exception e) {
            model.addAttribute("resultInfo", "such ticket doesn't exist");
        }
        
        return getTerminalPage(model);
    }
    
    @RequestMapping(value = "/terminal", params = {"returnTicket"})
    public String returnTicket(Model model, @RequestParam(value = "returnTicket") int ticketId) {
        terminal.returnTicket(ticketId);
        return getTerminalPage(model);
    }
    
    @RequestMapping(value = "/terminal")
    public String getTerminalPage(Model model) {
        return "terminal";
    }
}