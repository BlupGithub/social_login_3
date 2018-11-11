package com.wembleystudios.sociallogin

/**
 * Created by Álvaro Blanco Cabrero on 09/11/2018.
 * android.
 */
object Constants {

    const val METHOD_CHANNEL_NAME = "com.wembleystudios.social_login"
    const val METHOD_SET_CONFIG = "set_config"
    const val METHOD_LOGIN_FACEBOOK = "login_facebook"
    const val METHOD_GET_CURRENT_USER_FACEBOOK = "get_current_user_facebook"
    const val METHOD_LOGOUT_FACEBOOK = "logout_facebook"
    const val METHOD_LOGIN_GOOGLE = "login_google"
    const val METHOD_GET_CURRENT_USER_GOOGLE = "get_current_user_google"
    const val METHOD_LOGOUT_GOOGLE = "logout_google"
    const val METHOD_LOGIN_TWITTER = "login_twitter"
    const val METHOD_GET_CURRENT_USER_TWITTER = "get_current_user_twitter"
    const val METHOD_LOGOUT_TWITTER = "logout_twitter"

    const val METHOD_CODE_ERROR = "400"
    const val METHOD_ERROR_USER_CANCELED = "User Canceled"
    const val METHOD_ERROR_NOT_LOGGED_USER = "No user logged"
    val NO_USER_LOGGED_EXCEPTION = IllegalStateException(METHOD_ERROR_NOT_LOGGED_USER)

    /*Facebook related*/
    const val FACEBOOK_TOKEN = "facebook_token"

    /*Google related*/
    const val GOOGLE_ID_TOKEN = "google_id_token"

    /*Twitter related*/
    const val TWITTER_TOKEN = "twitter_token"
    const val TWITTER_SECRET = "twitter_secret"

}