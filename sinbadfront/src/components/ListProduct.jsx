import "../scss/products-pageSheet.scss";
import { FaCartPlus } from "react-icons/fa";
import { addToCart , viewPrice } from "../stores/shoppingCart";
import { Link } from "react-router-dom";

function lister(product) {
  
  const raiseTotal = viewPrice((state) => state.raiseTotal);
  
  const addItem = (id, name, price) => {
    addToCart(id, name, price,price);
    raiseTotal(price);
  };

  return (
    <>
      <Link to="/productinfo" state={{name:product.name,price:product.price,description : product.description, id: product.id}}><div className="product-box-style">{product.name}</div>
      <div className="product-box-price">${product.price}</div>{" "}</Link>    
       <button className="products-cart-icon" onClick={() => {addItem(product.id, product.name, product.price);}}>
        <FaCartPlus size="2em" color="gold" />
      </button> 
    </>
  );
}


export function ListProduct({ product, search }) {
  if ((product.category.toLowerCase().includes(search.toLowerCase())) || (product.name.toLowerCase().includes(search.toLowerCase()))
  ) {
    return (lister(product));
  } else if (search === "") {
    return (lister(product));
  }
}

