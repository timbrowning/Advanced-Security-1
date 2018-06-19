
package calculator;

//list imports

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class UI implements ActionListener 
  // initialise UI variables 
{
    private final JFrame frame;
    private final JPanel panel;
    private final JTextArea txt;
    private final JButton but[], AddBtn, MinusBtn, MultBtn, DivBtn,butEqual;
    private final Calculator Cal;

    private final String[] buttonValue = { "0", "1", "2", "3", "4", "5", "6",
            "7", "8", "9" };

    public UI()
    {
        //set title text, set size of gui. add operator interface
        
        frame = new JFrame("Calculator");
        frame.setResizable(false);
        txt = new JTextArea(4, 25);
        but = new JButton[10];
        panel = new JPanel(new FlowLayout());
        
        for (int i = 0; i < 10; i++) 
        {
            but[i] = new JButton(String.valueOf(i));
        }

        AddBtn = new JButton("+");
        MinusBtn = new JButton("-");
        MultBtn = new JButton("*");
        DivBtn = new JButton("/");
        butEqual = new JButton("=");
      
        Cal = new Calculator();
    }

    public void init() 
     // code required to see the gui  
    {
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.add(txt);
        
        for (int i = 0; i < 10; i++) {
            panel.add(but[i]);
            but[i].addActionListener(this);
        }
      //add panels to gui  
        panel.add(AddBtn);
        panel.add(MinusBtn);
        panel.add(MultBtn);
        panel.add(DivBtn);
        panel.add(butEqual);
        
   // add listeners
        AddBtn.addActionListener(this);
        MinusBtn.addActionListener(this);
        MultBtn.addActionListener(this);
        DivBtn.addActionListener(this);
        butEqual.addActionListener(this);
  
    }

    // calls functions to calculate answer.
    @Override
    public void actionPerformed(ActionEvent e)
    {
        final Object source = e.getSource();

        for (int i = 0; i < 10; i++)
        {
            if (source == but[i]) {
                txt.replaceSelection(buttonValue[i]);
                return;
            }
        }

        if (source == AddBtn) 
        {
            write(Cal.calculateUI(Calculator.Operators.add, read()));
        }

        if (source == MinusBtn) 
        {
            write(Cal.calculateUI(Calculator.Operators.minus, read()));
        }

        if (source == MultBtn) 
        {
            write(Cal.calculateUI(Calculator.Operators.multiply, read()));
        }

        if (source == DivBtn) 
        {
            write(Cal.calculateUI(Calculator.Operators.divide, read()));
        }

        if (source == butEqual) 
        {
            write(Cal.Equals(read()));
        }

        txt.selectAll();
    }
// reads the number
    public Double read()
    {
        Double num;
        String str;
        str = txt.getText();
        num = Double.valueOf(str);

        return num;
    }
    
    public void write(final Double num)
    {
        if (Double.isNaN(num)) 
        {
            txt.setText("");
        } else 
        {
            txt.setText(Double.toString(num));
        }
    }
}
