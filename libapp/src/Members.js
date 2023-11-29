import { Fragment, useState } from "react";
import './stylesheets/Members.css'
import axios from "axios";

const displayStudent = (studentData) => {
    return(<div className="info-card">
    <h1>WSU ID: <span>{studentData.id}</span></h1>
    <h1>Name: <span>{studentData.name}</span></h1>
    <h1>Address: <span>{studentData.address}</span></h1>
    <h1>Phone Number: <span>{studentData.phoneNumber}</span></h1>
    <h1>Email: <span>{studentData.email}</span></h1>
    {/* <h1>Major: <span>{studentData.major}</span></h1> */}
</div>);
}

function Members() {
    let [wsuId, setwsuId] = useState('');
    let [studentData, setStudentData] = useState({});
    let [member, setMember] = useState('student');
    const getStudentDetails = (wsuId) => {
        if(member == 'student'){
        studentData = axios.get(`http://localhost:8080/wsu/library/studentbyid?id=${wsuId}`)
        .then((response) => {
           return setStudentData(response.data);
        }).catch((error) => {
            return error;
        })
    }
    else {
        studentData = axios.get(`http://localhost:8080/wsu/library/facultybyid?id=${wsuId}`)
        .then((response) => {
           return setStudentData(response.data);
        }).catch((error) => {
            return error;
        })
    }
}
   
    return (
        <Fragment>
        <div className="searchbar">
        <input id="search-field" type="search" name="searchbar" onChange = {(event) => setwsuId(event.target.value)} placeholder="Enter the member id to get details"/>
        <button id = "search-btn" onClick={() => {getStudentDetails(wsuId)}}>search</button>
        <input id="student-radio" type="radio" value ="student" name="member" onChange={(event)=> setMember(event.target.value)} checked/>
        <label for = "student-radio">Student</label>
        <input id="faculty-radio" type="radio" value="faculty" name="member" onChange={(event)=> setMember(event.target.value)}/>
        <label for="faculty-radio">Faculty</label>
        </div>
        {JSON.stringify(studentData) !== '{}'? displayStudent(studentData) : <div></div>}
        </Fragment>
    );
}
export default Members;