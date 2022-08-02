// axios 객체
import axios from "axios";

function createApi() {
    return axios.create({
        //baseURL: process.env.VUE_APP_API_SERVER,
        baseURL: "http://localhost:9999/api",
        headers: {
            "Content-Type": "application/json",
        }
    });
}

export { createApi };