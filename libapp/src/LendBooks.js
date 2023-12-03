import React, { Fragment, useState } from "react";
import "./stylesheets/Members.css";
import axios from "axios";
import { useLocation } from "react-router-dom";

function LendBooks() {

    let [wsuId, setwsuId] = useState('');
    let [member, setMember] = useState('student');
    let [borrowedBooks, setBorrowedBooks] = useState([]);
    let location = useLocation();
    let getBorrowedBooks= (wsuId, id, member) => axios.get(`http://localhost:8080/wsu/library/addloan?memberId=${wsuId}&bookId=${id}&memberType=${member}`)
    .then((response) => {
        setBorrowedBooks(response.data);
        return response;
    }).catch((error) => {
        return error;
    })
    
    return(
        <Fragment>
        <div className="searchbar">
        <input id="search-field" type="search" name="searchbar" onChange = {(event) => setwsuId(event.target.value)} placeholder="Enter the wsu id of the member to lend the selected book"/>
        <button id = "search-btn" onClick={() => {getBorrowedBooks(wsuId, location.state.id, member)}}>search</button>
        <input id="student-radio" type="radio" value ="student" name="member"  onChange={(event)=> setMember(event.target.value)} checked/>
        <label for = "student-radio">Student</label>
        <input id="faculty-radio" type="radio" value="faculty" onChange={(event)=> setMember(event.target.value)} name="member" />
        <label for="faculty-radio">Faculty</label>
        </div>
        {borrowedBooks.length !==0 ? <h1>The following book is successfully given to member with id: {wsuId}</h1> : <h1>Enter a valid member id to lend the book.</h1>}
        </Fragment>
    );
}
export default LendBooks;