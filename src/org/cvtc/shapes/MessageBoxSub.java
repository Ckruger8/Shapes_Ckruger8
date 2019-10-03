package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class MessageBoxSub implements Dialog{

	public MessageBoxSub() {
		
	}

	@Override
	public int show(String message, String title) {
		return JOptionPane.OK_OPTION;
	}
	
}
