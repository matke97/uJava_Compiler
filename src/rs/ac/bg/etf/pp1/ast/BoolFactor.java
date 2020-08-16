// generated with ast extension for cup
// version 0.8
// 16/7/2020 1:1:29


package rs.ac.bg.etf.pp1.ast;

public class BoolFactor extends Factor {

    private Boolean fact;

    public BoolFactor (Boolean fact) {
        this.fact=fact;
    }

    public Boolean getFact() {
        return fact;
    }

    public void setFact(Boolean fact) {
        this.fact=fact;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("BoolFactor(\n");

        buffer.append(" "+tab+fact);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [BoolFactor]");
        return buffer.toString();
    }
}
