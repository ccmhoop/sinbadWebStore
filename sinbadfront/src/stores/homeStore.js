import axios from 'axios'
import { create } from 'zustand'

const homeStore = create ((set) =>({
    products: [],
  
    fetchHomeProducts : async() => {
        const homeProducts = await axios.get('https://api.coingecko.com/api/v3/search/trending')

        const products = homeProducts.data.coins.map(product=>{
            return{
            name: product.item.name,
            image: product.item.large,
            id: product.item.id
            };
        });
        set({products})
    },
}))

export default homeStore
