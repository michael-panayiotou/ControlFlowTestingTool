package cei521.controlflowtestingtool;

import java.awt.EventQueue;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//this is just a comment
        

import java.awt.Color;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ControlFlowTestingUI  extends javax.swing.JFrame {

	private JFrame frame;

	/**
	 * 	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControlFlowTestingUI window = new ControlFlowTestingUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ControlFlowTestingUI() {
		initialize();
	}
	   
	
	class HighLightSourceCode extends DefaultHighlighter.DefaultHighlightPainter
	    {

	        public HighLightSourceCode(Color color) {
	            super(color);
	        }
	        
	              
	    }
	    Highlighter.HighlightPainter myHighlightPainter = new HighLightSourceCode(Color.yellow);  
	    
	    public void removeHighlight(JTextComponent textComp) {
	        Highlighter hilite = textComp.getHighlighter();
	        Highlighter.Highlight[] hilites = hilite.getHighlights();
	        
	        for(int i = 0; i < hilites.length; i++) {
	            if(hilites[i].getPainter() instanceof HighLightSourceCode) {
	                hilite.removeHighlight(hilites[i]);
	            }
	        }
	        }
	    
	    
	/**
	 * Initialize the contents of the frame.
	 */
	    JLabel lblCount;
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 844, 465);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel paneBurger = new JPanel();
		frame.getContentPane().add(paneBurger, "name_22451503339373");
		
		JButton btnWhile = new JButton("While");
		btnWhile.setBounds(16, 58, 75, 29);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(169, 63, 501, 355);
		paneBurger.add(textArea);
		
		paneBurger.setLayout(null);
		paneBurger.add(btnWhile);
		
		JButton btnFor = new JButton("For");

		btnFor.setBounds(16, 85, 75, 29);
		paneBurger.add(btnFor);
		
		JButton btnIf = new JButton("If");
		btnIf.setBounds(16, 112, 75, 29);
		paneBurger.add(btnIf);
		
		JButton btnSwitch = new JButton("Switch");
		btnSwitch.setBounds(16, 140, 75, 29);
		paneBurger.add(btnSwitch);
		
		JLabel lblWhile = new JLabel(": 0");
		lblWhile.setBounds(101, 68, 46, 14);
		paneBurger.add(lblWhile);
		
		JLabel lblFor = new JLabel(": 0");
		lblFor.setBounds(101, 92, 46, 14);
		paneBurger.add(lblFor);
		
		JLabel lblIf = new JLabel(": 0");
		lblIf.setBounds(101, 119, 46, 14);
		paneBurger.add(lblIf);
		
		JLabel lblSwitch = new JLabel(": 0");
		lblSwitch.setBounds(101, 147, 46, 14);
		paneBurger.add(lblSwitch);
		
		JLabel lblIntegers = new JLabel(": 0");
		lblIntegers.setBounds(101, 175, 46, 14);
		paneBurger.add(lblIntegers);
		
		JLabel lblStrings = new JLabel(": 0");
		lblStrings.setBounds(101, 203, 46, 14);
		paneBurger.add(lblStrings);
		
		JLabel lblFloats = new JLabel(": 0");
		lblFloats.setBounds(101, 231, 46, 14);
		paneBurger.add(lblFloats);
		
		JButton btnCount = new JButton("Count");
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count(textArea, lblIf, lblSwitch, lblFor, lblWhile, lblIntegers, lblFloats, lblStrings);
			}
		});
		btnCount.setBounds(16, 298, 75, 23);
		paneBurger.add(btnCount);
		
		JButton btnIntegers = new JButton("Integers");
		btnIntegers.setBounds(16, 168, 75, 29);
		paneBurger.add(btnIntegers);
		
		JButton btnStrings = new JButton("Strings");
		btnStrings.setBounds(16, 196, 75, 29);
		paneBurger.add(btnStrings);
		
		JButton btnFloats = new JButton("Floats");
		btnFloats.setBounds(16, 224, 75, 29);
		paneBurger.add(btnFloats);
		

		
		btnWhile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				highlight(textArea, "while");
			}
		});
		
		btnFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				highlight(textArea, "for");
			}
		});
		
		btnIf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				highlight(textArea, "if");
			}
		});
		
		btnSwitch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				highlight(textArea, "switch");
			}
		});
		
		
		JPanel panelMenu = new JPanel();
		frame.getContentPane().add(panelMenu, "name_22460779132613");
		
		JPanel panelChicken = new JPanel();
		frame.getContentPane().add(panelChicken, "name_22464482082225");
		
		textArea.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				count(textArea, lblIf, lblSwitch, lblFor, lblWhile, lblIntegers, lblFloats, lblStrings);
				
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				count(textArea, lblIf, lblSwitch, lblFor, lblWhile, lblIntegers, lblFloats, lblStrings);

				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				count(textArea, lblIf, lblSwitch, lblFor, lblWhile, lblIntegers, lblFloats, lblStrings);

			}

	    });
		
		
	}
	
	public void count(JTextComponent textComp, JLabel lblIf, JLabel lblSwitch, JLabel lblFor, JLabel lblWhile, JLabel lblIntegers, JLabel lblFloats, JLabel lblStrings){
		removeComments(textComp);
	      String s = textComp.getText();
	      String[] splitted = s.split("\\s|\\n|[(]|\\[");
	      HashMap hm = new HashMap();
	      int x;

	      for (int i = 0; i < splitted.length; i++) {
	          if (!hm.containsKey(splitted[i])) {
	              hm.put(splitted[i], 1);
	          } else {
	              hm.put(splitted[i], (Integer) hm.get(splitted[i]) + 1);
	          }
	      }
	      for (Object word : hm.keySet()){
	           //System.out.println(word + " " + (Integer) hm.get(word));
	            //JOptionPane.showMessageDialog(null,word + " " + hm.get(word));
	            if(word.equals("for")){
	                lblFor.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	            if(word.equals("while")){
	                lblWhile.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	            if(word.equals("switch")){
	                lblSwitch.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	            if(word.equals("if")){
	                lblIf.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	            if(word.equals("String")){
	                lblStrings.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	            if(word.equals("int")){
	                lblIntegers.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	            if(word.equals("float")){
	                lblFloats.setText(": " + String.valueOf(hm.get(word))); //return the first found
	            }
	      }
	      
	      
	}
	
	 public void removeComments(JTextComponent textComp) {
	        try {
	            Document doc;
	            doc = textComp.getDocument();
	            String text = doc.getText(0, doc.getLength());
	            String temptext = (text.replaceAll("(?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*)",""));
	            textComp.setText(temptext);
	        } catch (Exception e) {
	        }
	        
	        
	    }
	    
	    
	    public void highlight(JTextComponent textComp, String pattern) {
	            
	            removeComments(textComp);
	            try {
	                removeHighlight(textComp);
	                Highlighter hilite = textComp.getHighlighter();
	                Document doc;
	                doc = textComp.getDocument();
	                String text = doc.getText(0, doc.getLength());
	                int pos = 0;
	                
	                while ((pos = text.toUpperCase().indexOf(pattern.toUpperCase(), pos)) >= 0) {
	                    if(pos == 0){
	                        if ((text.charAt(pos+pattern.length()) == ' ')||(text.charAt(pos+pattern.length()) == '(')||(text.charAt(pos+pattern.length()) == '\n')){
	                          hilite.addHighlight(pos, pos+pattern.length(), myHighlightPainter);
	                        }
	                    }
	                    else{
	                        if (!(Character.isLetter(text.charAt(pos-1)))&&((text.charAt(pos+pattern.length()) == ' ')||(text.charAt(pos+pattern.length()) == '(')||(text.charAt(pos+pattern.length()) == '\n'))){
	                          hilite.addHighlight(pos, pos+pattern.length(), myHighlightPainter);
	                        }
	                    }
	                    pos += pattern.length();
	                    
	                }
	            } catch (Exception e) {
	                
	            }
	            
	        }
}
