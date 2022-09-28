

public class Main {

	public static void main(String[] args) {
		Product product =new Product();
		product.name="Laptop";
		product.id=1;
		product.desciption="Asus Laptop";
		product.price=5000;
		product.stockAmount=3;
		product.color="";  
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
	/*	ProductManager.Add2(id:1,name: "",description: "",stockAmount: 2,price: 200);
		ProductManager.Add2(id:1,name: "",description: "",stockAmount: 2,price: 200);
		ProductManager.Add2(id:1,name: "",description: "",stockAmount: 2,price: 200);
		ProductManager.Add2(id:1,name: "",description: "",stockAmount: 2,price: 200);
		ProductManager.Add2(id:1,name: "",description: "",stockAmount: 2,price: 200);
		ProductManager.Add2(id:1,name: "",description: "",stockAmount: 2,price: 200); */
		
		
		
	}

}
