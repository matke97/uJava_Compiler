// generated with ast extension for cup
// version 0.8
// 1/8/2020 17:30:50


package rs.ac.bg.etf.pp1.ast;

public class AddAssigment extends AddopRight {

    public AddAssigment () {
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
        buffer.append("AddAssigment(\n");

        buffer.append(tab);
        buffer.append(") [AddAssigment]");
        return buffer.toString();
    }
}
