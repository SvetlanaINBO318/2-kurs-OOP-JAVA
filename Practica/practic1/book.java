public class Book {

private int page;

private String name;

public Book(int page, String name) {

this.page = page;

this.name = name;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public void setPage(int page) {

this.page = page;

}

public int getPage() {

return page;

}

public String toString() {

return "Книга: "+getName()+". Кол-во страниц: "+getPage()+ " " ;

}

}
