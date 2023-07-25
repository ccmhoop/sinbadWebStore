import axios from "axios";
import { create } from "zustand";

const managerStore = create((set) => ({
  storage: [],

  fetchStorage: async () => {
    const sinbadStorage = await axios.get(
      "http://localhost:8080/api/v1/product"
    );
    console.log("Fetch", sinbadStorage);

    const storage = sinbadStorage.data.map((items) => {
      return {
        name: items.productType,
        price: items.productPrice,
        id: items.storage[0].storageID,
        amount: items.storage[0].amount,
      };
    });
    console.log("Fetch Sorted", storage);
    set({ storage });
  },
}));

export default managerStore;
