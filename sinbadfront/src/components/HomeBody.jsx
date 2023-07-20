import React from "react";
import "../scss/homeSheet.scss";
export default function HomeBody({product}) {
  return (
          <div className="product-box box-style">{product.name}</div>
  );
}
