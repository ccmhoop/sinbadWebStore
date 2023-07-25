import React from "react";
import StorageProduct from "../components/StorageProduct";
import managerStore from "../stores/managerStore";

export default function Manager() {
  //   const [storage, setStorage] = useState([]);

  const storage = managerStore();

  React.useEffect(() => {
    storage.fetchStorage();
  }, []);

  return (
    <>
      <div>
        {storage.storage.map((product) => (
            <ul key={product.id}>
              Item
              <li>{product.name} </li>
              <li>{product.amount}</li>
              <li>{product.price}</li>
            </ul>
        ))}
      </div>
    </>
  );
}
