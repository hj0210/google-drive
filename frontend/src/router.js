
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import DriveUploadSystemManager from "./components/listers/DriveUploadSystemCards"
import DriveUploadSystemDetail from "./components/listers/DriveUploadSystemDetail"

import IndexerIndexprocessManager from "./components/listers/IndexerIndexprocessCards"
import IndexerIndexprocessDetail from "./components/listers/IndexerIndexprocessDetail"

import VideoProcessingVideoprocessManager from "./components/listers/VideoProcessingVideoprocessCards"
import VideoProcessingVideoprocessDetail from "./components/listers/VideoProcessingVideoprocessDetail"

import NotificationNotifyprocessManager from "./components/listers/NotificationNotifyprocessCards"
import NotificationNotifyprocessDetail from "./components/listers/NotificationNotifyprocessDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/drives/uploadSystems',
                name: 'DriveUploadSystemManager',
                component: DriveUploadSystemManager
            },
            {
                path: '/drives/uploadSystems/:id',
                name: 'DriveUploadSystemDetail',
                component: DriveUploadSystemDetail
            },

            {
                path: '/indexers/indexprocesses',
                name: 'IndexerIndexprocessManager',
                component: IndexerIndexprocessManager
            },
            {
                path: '/indexers/indexprocesses/:id',
                name: 'IndexerIndexprocessDetail',
                component: IndexerIndexprocessDetail
            },

            {
                path: '/videoProcessings/videoprocesses',
                name: 'VideoProcessingVideoprocessManager',
                component: VideoProcessingVideoprocessManager
            },
            {
                path: '/videoProcessings/videoprocesses/:id',
                name: 'VideoProcessingVideoprocessDetail',
                component: VideoProcessingVideoprocessDetail
            },

            {
                path: '/notifications/notifyprocesses',
                name: 'NotificationNotifyprocessManager',
                component: NotificationNotifyprocessManager
            },
            {
                path: '/notifications/notifyprocesses/:id',
                name: 'NotificationNotifyprocessDetail',
                component: NotificationNotifyprocessDetail
            },




    ]
})
