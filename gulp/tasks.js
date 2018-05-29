/*
  tasks.js
  ===========
  defaults wraps generate-assets, watch and server
*/

var gulp = require('gulp')
var runSequence = require('run-sequence')

gulp.task('build', ['generate-assets'])

gulp.task('default', function (done) {
  runSequence('generate-assets',
                'watch',done)
})

gulp.task('generate-assets', function (done) {
  runSequence('clean',
                'copy-govuk-modules',
                'sass',done)
})

gulp.task('copy-govuk-modules', [
  'copy-toolkit',
  'copy-template-assets',
  'copy-elements-sass',
  'copy-template'
])


