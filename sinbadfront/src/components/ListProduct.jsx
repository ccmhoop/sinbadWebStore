import "../scss/products-pageSheet.scss";
import { FaCartPlus } from "react-icons/fa";
import { addToCart } from "../stores/shoppingCart";

function lister(product) {
  
  const addItem = (id, name, price) => {
    addToCart(id, name, price);
  };

  return (
    <>
      <div className="product-box-style">{product.name}</div>
      <div className="product-box-price">${product.price}</div>{" "}
      <button className="products-cart-icon" onClick={() => {addItem(product.id, product.name, product.price);}}>
        <FaCartPlus size="2em" color="gold" />
      </button>
    </>
  );
}

export default function ListProduct({ product, search }) {
  if (
    product.category.toLowerCase().includes(search.toLowerCase()) ||
    product.name.toLowerCase().includes(search.toLowerCase())
  ) {
    return <>{lister(product)}</>;
  } else if (search === "") {
    return <>{lister(product)}</>;
  }
}
