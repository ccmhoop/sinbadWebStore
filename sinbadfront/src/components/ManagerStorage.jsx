import React,{useState} from 'react'




export default function ManagerStorage({storageId,quantity,name,price,unitPrice,id}) {

  const handleSubmit = (e) => {
    e.preventDefault();
  };

  const [amount, setAmount] = useState(0)

  return (
<>
    <div>{name}  </div>
    <span>cost: ${unitPrice}</span> 
    <span>stock: {quantity}</span> 
    <form onSubmit={handleSubmit}>
    <input
          type="text"
          pattern="[0-9]*"
          name="quantity"
          value={amount} 
          onChange={(e) => setAmount((v) => (e.target.validity.valid ? e.target.value : v))}
        />
            <button type="submit">Order</button>
      </form>
      </>
  
  
  )
}
