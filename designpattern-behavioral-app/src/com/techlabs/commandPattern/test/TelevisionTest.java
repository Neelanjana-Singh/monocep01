package com.techlabs.commandPattern.test;
import com.techlabs.commandPattern.model.ICommand;
import com.techlabs.commandPattern.model.OffCommand;
import com.techlabs.commandPattern.model.OnCommand;
import com.techlabs.commandPattern.model.RemoteControl;
import com.techlabs.commandPattern.model.Television;

public class TelevisionTest {

	public static void main(String[] args) {
        Television tv = new Television();
        
        ICommand onCommand = new OnCommand(tv);
        ICommand offCommand = new OffCommand(tv);

        RemoteControl remote = new RemoteControl(onCommand);
        remote.pressButton(); 
        
        remote.setCommand(offCommand);
        remote.pressButton();

	}

}

