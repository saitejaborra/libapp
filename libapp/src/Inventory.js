import axios from "axios";
import React, { useState } from "react";
import { useEffect } from "react";
import './stylesheets/Inventory.css'

function Inventory() {
    let [books, setbooks] = useState([]);
    useEffect(() => {
        axios.get('http://localhost:8080/wsu/library/books').then((response) => {
            setbooks(response.data);
        }).catch((error) => {
            return error;
        });
    },[]);
    const rows = books.map((item) =>  {
        return (<tr>
        <td>{item.title}</td>
    <td>{item.author}</td>
    <td>{item.publisher}</td>
    <td>{item.isbn}</td>
    <td>{item.publicationYear}</td>
    <td>{item.numberOfPages}</td>
    <td>{item.availableCopies}</td>
    <td><button id="lend-btn">Lend</button></td>
    </tr>
    )})
    return(
       <table>
        <thead>
        <tr>
            <th>Book</th>
            <th>Author</th>
            <th>Publisher</th>
            <th>ISBN</th>
            <th> Year of Publication</th>
            <th>Pages</th>
            <th>Total copies</th>
            <th>Lend Book</th>
        </tr>
        </thead>
        <tbody>
            {rows}
            
            </tbody>
       </table>
    );
}
export default Inventory;