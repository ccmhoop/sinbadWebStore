import React,{useState} from "react";
import Header from "../components/Header";
import Footer from "../components/Footer";
import StickyBar from "../components/StickyBar";
import { useLocation } from "react-router-dom";
import { addToCart,quant, removeFromCart,viewPrice } from "../stores/shoppingCart";
import "../scss/homeSheet.scss";

export default function ProductInfo() {

  const location = useLocation();

  const name = location.state?.name;
  const price = location.state?.price;
  const description = location.state?.description;
  const id = location.state?.id;

  const [itemQuantity, setItemQuantity] = useState(quant(id));
  const raiseTotal = viewPrice((state) => state.raiseTotal);
  const lowerTotal = viewPrice((state) => state.lowerTotal);

  const addItem = (id, name, price) => {
    addToCart(id, name, price, price);
    raiseTotal(price);
    setItemQuantity(quant(id));
  };

  const removeItem = (id) => {
    if (quant(id)>0) {
      removeFromCart(id);
      lowerTotal(price);
      setItemQuantity(quant(id));
    }
  };

  return (
    <>
      <Header />
      <StickyBar />
      <div className="app">
        <div>{name}</div>
        <div>{description}</div>
        <div>{price}</div>
        <button onClick={() => {addItem(id, name, price)}}>add</button>
        <div>{itemQuantity}</div>
        <button onClick={() => {removeItem(id)}}>remove</button>
        <Footer />
      </div>
    </>
  );
}
