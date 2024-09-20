public class PruevaVentas {
    public static void main(String[] args) {
        System.out.println("**** Sistema de ventas ****");
        System.out.println(" ");

        var producto1 = new Producto("blusa", 30.00);
        var producto2 = new Producto("zapatos", 70.00);
        var producto3 = new Producto("pantalon", 60.00);
        var producto4 = new Producto("gorra", 10.70);
        var producto5 = new Producto("corbata", 08.00);
        var producto6 = new Producto("calcetines", 70.00);
        var producto7 = new Producto("cinto", 70.00);




        //Primer orden
        var orden1  = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();


        //segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.mostrarOrden();


    }
}
