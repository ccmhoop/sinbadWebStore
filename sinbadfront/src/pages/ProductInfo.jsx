import React, { useState } from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import { useLocation } from "react-router-dom";
import { addToCart, removeFromCart, viewPrice } from "../stores/shoppingCart";
import { quant } from "../stores/shoppingCart";
import "../scss/homeSheet.scss";
import "../scss/productinfo-pageSheet.scss";

export default function ProductInfo() {
  const location = useLocation();

  const name = location.state?.name;

  const price = location.state?.price;

  const description = location.state?.description;

  const id = location.state?.id;

  const [itemQuantity, setItemQuantity] = useState(quant(id));

  const raiseTotal = viewPrice((state) => state.raiseTotal);

  const lowerTotal = viewPrice((state) => state.lowerTotal);

  const displayPrice = (price * itemQuantity).toFixed(2);

  const addItem = (id, name, price) => {
    addToCart(id, name, price, price);

    raiseTotal(price);

    setItemQuantity(quant(id));
  };

  const removeItem = (id) => {
    if (quant(id) > 0) {
      removeFromCart(id);

      lowerTotal(price);

      setItemQuantity(quant(id));
    }
  };
  React.useEffect(() => {
    //  store.fetchProducts();
  }, []);

  return (
    <>
      <Header />
      <StickyBar />
      <div className="app">
        <div className="productinfo-container">
          <div className="productinfo-wrapper">
            <div className="">
              <div className="product">
                <div className="name name-text">{name}</div>
                <div className="price">${price}</div>
                <div className="description">{description}</div>
              </div>
            </div>

            <div className="buttons-and-amount">
              <div className="buttons">
                <button
                  className="button"
                  onClick={() => {
                    addItem(id, name, price);
                  }}
                >
                  Add
                </button>
                <div className="quantity">{itemQuantity}</div>
                <button
                  className="button"
                  onClick={() => {
                    removeItem(id, price);
                  }}
                >
                  Remove
                </button>
              </div>

              <div className="display-price">${displayPrice}</div>
            </div>
          </div>
        </div>

        <Footer />
      </div>
    </>
  );
}