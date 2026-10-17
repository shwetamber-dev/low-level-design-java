package in.codewithsp.prototype;

public class PrototypeWithClonable implements Cloneable{

    private String textPad;

    public PrototypeWithClonable(String text){
        this.textPad = text;
    }

    public String getTextPad() {
        return textPad;
    }

    public void setTextPad(String text) {
        this.textPad = textPad + text;
    }

    @Override
    public PrototypeWithClonable clone() {
        try {
            return (PrototypeWithClonable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
