
const CART_ITEMS_KEY = "cart_items";

export const cartItems = JSON.parse(localStorage.getItem(CART_ITEMS_KEY)) || [];

export function getCartItemsFromLocalStorage() {
  return JSON.parse(localStorage.getItem(CART_ITEMS_KEY)) || [];
}

export function addToCart(productId,name,price) {
  const checkDuplicate = cartItems.find((item) => item.productId === productId);
  if (checkDuplicate) {
    checkDuplicate.quantity += 1;
    checkDuplicate.price += price;
  } else {
      const newItem = {productId,name,price, quantity: 1 };
      cartItems.push(newItem);  
  }
  localStorage.setItem(CART_ITEMS_KEY, JSON.stringify(cartItems));
  console.log("cart",cartItems);
}




 
