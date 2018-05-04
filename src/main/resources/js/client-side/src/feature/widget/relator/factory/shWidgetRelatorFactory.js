shioharaApp.factory('shWidgetRelatorFactory', [ '$uibModal', 'shPostResource',
		'Notification', '$filter', "$state",
		function($uibModal, shPostResource, Notification, $filter, $state) {
			return {
				modalSelectRelatorItem : function(shPostAttr) {
					var $ctrl = this;
					return $uibModal.open({
						animation : true,
						ariaLabelledBy : 'modal-title',
						ariaDescribedBy : 'modal-body',
						templateUrl : 'template/widget/relator/relator-select.html',
						controller : 'ShWidgetRelatorSelectCtrl',
						controllerAs : '$ctrl',
						size : null,
						appendTo : undefined,
						resolve : {
							shPostAttr : function() {
								return shPostAttr;
							}
						}
					});
				}
			}
		} ]);
