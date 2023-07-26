import { create } from "zustand";
import { userData } from "../stores/loginState";
import axios from "axios";

const CART_ITEMS_KEY = "cart_items";

export const cartItems = JSON.parse(localStorage.getItem(CART_ITEMS_KEY)) || [];

export function getCartItemsFromLocalStorage() {
  return JSON.parse(localStorage.getItem(CART_ITEMS_KEY)) || [];
}

export function addToCart(productId, name, price, priceTotal) {
  const checkDuplicate = cartItems.find((item) => item.productId === productId);
  if (checkDuplicate) {
    checkDuplicate.quantity += 1;
    checkDuplicate.priceTotal += price;
  } else {
    const newItem = { productId, name, price, priceTotal, quantity: 1 };
    cartItems.push(newItem);
  }
  localStorage.setItem(CART_ITEMS_KEY, JSON.stringify(cartItems));
  console.log("cart", cartItems);
}

export function removeFromCart(productId) {
  const index = cartItems.findIndex((item) => item.productId === productId);
  if (index !== -1) {
    const item = cartItems[index];
    if (item.quantity > 1) {
      item.quantity -= 1;
      item.priceTotal -= item.price;
    } else {
      cartItems.splice(index, 1);
    }
    localStorage.setItem(CART_ITEMS_KEY, JSON.stringify(cartItems));
    console.log("cart", cartItems);
  }
}

export const totalPrice = cartItems.reduce(
  (addUpPrice, total) => addUpPrice + total.priceTotal,
  0
);

export const viewPrice = create((set) => ({
  total: totalPrice,
  raiseTotal: (price) => set((state) => ({ total: state.total + price })),
  lowerTotal: (price) => set((state) => ({ total: state.total - price })),
}));

export const quant = (id) => {
  const index = cartItems.findIndex((item) => item.productId === id);
  if (index != -1) {
    return cartItems[index].quantity;
  } else {
    return 0;
  }
};

export const userCartdata = () => {
  cartItems.forEach((element) => {
    let storageID = element.productId;
    let customerId = userData[0].id;
    let amount = element.quantity;
    console.log("check", customerId, amount, storageID);
    axios
      .post(
        `http://localhost:8080/api/v1/shop/save/${customerId}/${storageID}/${amount}`
      )
      .then((response) => {
        console.log(
          "order successful",
          response.data
        );
      })
      .catch((error) => {
        console.error("order Failes:", error);
      });
  });
};

export const checkOutStorage = () => {
  // const data = []
  //   cartItems.forEach(element => {
  //     data.push([element.quantity,element.productId])
  //   });
  //   console.log("Storage",data);
  //   return data;
};
