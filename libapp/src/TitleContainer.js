import React, { Fragment } from "react";
import './stylesheets/TitleContainer.css';

function TitleContainer() {
    return(
        <Fragment>
        <video id='background-video' autoPlay loop muted>
      <source src='../background.mp4' type='video/webm' />
    </video>
        <div className="title">
            <h1>Wichita State University -Ablah Library</h1>
            <p>PLACE WHERE TALENT MEETS INNOVATION</p>
        </div>
        </Fragment>
    );
}
export default TitleContainer;