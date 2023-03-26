package Expression;

import java.util.ArrayList;
import java.util.List;

public class program {
    public List<Expression> expressions;

    public program(){
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Expression e){
        expressions.add(e);
    }
}
