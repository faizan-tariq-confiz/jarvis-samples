
# filename: login_screen.py
import streamlit as st
from google.auth.transport.requests import Request
from google.oauth2 import id_token
import requests

CLIENT_ID = "YOUR_GOOGLE_CLIENT_ID"

def authenticate_user(token):
    try:
        # Specify the CLIENT_ID of the app that accesses the backend:
        idinfo = id_token.verify_oauth2_token(token, requests.Request(), CLIENT_ID)

        if idinfo['iss'] not in ['accounts.google.com', 'https://accounts.google.com']:
            raise ValueError('Wrong issuer.')

        return idinfo
    except ValueError:
        return None

st.title('Login with Google')

token = st.text_input('Enter your Google token')

login_btn = st.button('Login')

if login_btn:
    user_info = authenticate_user(token)
    if user_info:
        st.success(f"Successfully logged in as {user_info.get('email')}.")
    else:
        st.error("Authentication failed. Please try again.")
