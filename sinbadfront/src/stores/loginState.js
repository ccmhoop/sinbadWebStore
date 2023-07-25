import { create } from "zustand";

const USER_DATA = "user_data";


export const userData = JSON.parse(localStorage.getItem(USER_DATA)) || [];



export const userRole = create((set) => ({
  role: Boolean,
  roleUser: (Boolean) => set((state) => ({ role: state.role = Boolean })),
}));

export const userLogedIn = create((set) => ({
  logedIn:Boolean,
  loginStatus: (Boolean) => set((state) => ({ logedIn: state.logedIn = Boolean}))
}));

export function localUserData(
  customerName,
  customerSurname,
  eMail,
  address,
  dateOfBirth,
  phone,
  timesOrdered,
  id,

) {
  userData.length = 0;
  
  const logedInUser = {
    customerName: customerName,
    customerSurname: customerSurname,
    eMail: eMail,
    address: address,
    dateOfBirth: dateOfBirth,
    phone: phone,
    timesOrdered: timesOrdered,
    id: id
  };


  userData.push(logedInUser);
  localStorage.setItem(USER_DATA, JSON.stringify(userData));

  console.log("userData", userData);
}

export const log = () => {
  if(userData.length>0){
   return true;
  }else{
    return false;
  }
  }
