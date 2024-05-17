package event.listener;

import java.util.UUID;

import org.springframework.context.ApplicationListener;

import entity.User;
import event.RegistrationCompleteEvent;

public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

	@Override
	public void onApplicationEvent(RegistrationCompleteEvent event) {
		//Create the verification Token for the user with link
		User user = event.getUser();
		String Token=UUID.randomUUID().toString();
		
		
		
	}

}
