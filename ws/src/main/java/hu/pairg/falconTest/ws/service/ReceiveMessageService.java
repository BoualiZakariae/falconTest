package hu.pairg.falconTest.ws.service;

import hu.pairg.falconTest.ws.domain.Message;
import org.springframework.stereotype.Service;

/**
 * Created by pairg on 2016.04.24..
 */
@Service
public interface ReceiveMessageService {

    public void receiveMessage(String roomName, Message message);

}
