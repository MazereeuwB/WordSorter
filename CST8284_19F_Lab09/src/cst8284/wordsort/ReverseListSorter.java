package cst8284.wordsort;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

public class ReverseListSorter implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Collections.reverse(WordSorter.getListOfStrings());
		WordSorter.reloadJTextArea();
		
	}

}
