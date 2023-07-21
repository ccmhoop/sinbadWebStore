import axios from "axios";
import { create } from "zustand";

const productStore = create((set) => ({
  products: [],

  fetchProducts: async () => {
    const sinbadproducts = await axios.get(
      "http://localhost:8080/api/v1/product"
    );
    console.log("Fetch", sinbadproducts);

    const products = sinbadproducts.data.map((product) => {
      return {
        name: product.productType,
        category: product.category,
        description: product.description,
        price: product.productPrice,
        id: product.productID,
      };
    });
    console.log("Fetch Sorted", products);
    set({ products });
  },
}));

export default homeStore;
