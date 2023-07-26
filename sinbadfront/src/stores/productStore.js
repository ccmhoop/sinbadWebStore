import axios from "axios";
import { create } from "zustand";
import debounce from "../helpers/debounce";


const productStore = create((set) => ({
  products: [],

  fetchProducts: async () => {
    const sinbadproducts = await axios.get(
      "http://localhost:8080/api/v1/product"
    );
    console.log("Fetch1", sinbadproducts);

    const products = sinbadproducts.data.map((product) => {
      return {
        name: product.productType,
        category: product.category,
        description: product.description,
        price: product.productPrice,
        total: product.productPrice,
        id: product.productID,
      };
    });
    console.log("Fetch Sorted1", products);
    set({ products });
  },
}));







export default productStore;
