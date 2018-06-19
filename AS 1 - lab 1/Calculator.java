package calculator;

public class Calculator 
{
    //list operators
    public enum Operators
    {
        number, add, minus, multiply, divide
    }

    private Double num1, num2;
    private Operators answer = Operators.number;

    // Function which does the calculation
    private Double calculate() 
    {
        if (answer == Operators.number)
        {
            return num2;
        }
        if (answer == Operators.add)
        {
            return num1 + num2;
        }
        if (answer == Operators.minus) 
        {
            return num1 - num2;
        }
        if (answer == Operators.multiply) 
        {
            return num1 * num2;
        }
        if (answer == Operators.divide) 
        {
            return num1 / num2;
        }


        throw new Error();
    }
    
    public Double calculateUI(Operators mode1, Double num) 
    {
        if (answer == Operators.number) 
        {
            num2 = 0.0;
            num1 = num;
            answer = mode1;
            return Double.NaN;
        } 
        else 
        
        {
            num2 = num;
            num1 = calculate();
            answer = mode1;
            return num1;
        }
    }

    public Double Equals(Double num) 
    
    {
        return calculateUI(Operators.number, num);
    }


}


