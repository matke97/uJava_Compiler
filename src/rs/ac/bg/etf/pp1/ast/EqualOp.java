// generated with ast extension for cup
// version 0.8
// 15/7/2020 11:28:49


package rs.ac.bg.etf.pp1.ast;

public class EqualOp extends Relop {

    public EqualOp () {
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
        buffer.append("EqualOp(\n");

        buffer.append(tab);
        buffer.append(") [EqualOp]");
        return buffer.toString();
    }
}
