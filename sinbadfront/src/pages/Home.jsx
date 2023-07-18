import React from "react";
import homeStore from "../stores/homeStore";
import ListItem from "../components/ListItem";

export default function Home() {
  const store = homeStore()

  React.useEffect(() => {
    store.fetchHomeProducts();
  }, []);

  return (
    <>
      <div>
        Home test test{" "}
        {store.products.map((product) => {
          return (
            <div key={product.id}>
              <ListItem key={product.id} product={product} />
            </div>
          );
        })}
      </div>
    </>
  );
}
