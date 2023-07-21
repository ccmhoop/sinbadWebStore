import React from "react";
import "../scss/products-pageSheet.scss";
import { FaCartPlus } from "react-icons/fa";

function lister(product){
  return (
    <>
      <div className="product-box-style">
      <span className="products-name">{product.name}</span>
        <div className="product-box-price">${product.price}</div>{" "}
      </div>
      <span className="products-cart-icon">
        <FaCartPlus size="1.2em" />
      </span>
    </>
  );
}

export default function ListProduct({ product, search}) {
  if(product.category.toLowerCase().includes(search.toLowerCase())||product.name.toLowerCase().includes(search.toLowerCase())){
    return (
      <>{lister(product)}</>
    );
  }else if(search===""){
    return (
      <>{lister(product)}</>
    )
  }
}
