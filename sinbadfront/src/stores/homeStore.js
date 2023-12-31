import axios from "axios";

import { create } from "zustand";

const homeStore = create((set) => ({
  
  products: [],


  fetchHomeProducts: async () => {

    const sinbadproducts = await axios.get(
      "http://localhost:8080/api/v1/product"
    );
    console.log("fetch", sinbadproducts);
     const category = homeStore.getState();


    const products = sinbadproducts.data.map((product) => {
      if(category.category === product.category){
        console.log("daddy",product.category,"da",category.category)

      }
            return {
        name: product.productType,
        category: product.category,
        description: product.description,
        price: product.productPrice,
        id: product.productID,
      };
  
    });
    console.log("fetch sorted", products);
    set({ products });
  },
})
);

export default homeStore;
