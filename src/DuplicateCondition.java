/* Refaktorer koden for at fjerne duplikerede if-betingelser */

void main() {
    int age = 25;

    if (age >= 18) {
        IO.println("Can vote "+"and "+"Is an adult\"");
    }

    if (age >= 18) {
        IO.println("Can drive");
    }

}
