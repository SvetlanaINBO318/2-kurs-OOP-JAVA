public class Ball {

private int size;

private String color;

public void setColor(String color) {

this.color = color;

}

public String getColor() {

return color;

}

public void setSize(int size) {

this.size = size;

}

public int getSize() {

return size;

}

public Ball(int size, String color) {

this.size = size;

this.color = color;

}

public String toString() {

return "Размер мяча: "+getSize()+". Цвет мяча: "+ getColor()" ";

}

}
