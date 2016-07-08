/**
 * Created by parth on 30/6/16.
 */
var myUIModel = {
    id: worldName,
    label: capitalizeFirstLetter(worldName),
    name: worldName,
    namePlural: worldName + "s",
    fnTitle: 'id',
    fnSearch: ['id', 'name'],
    elements: [
        {
            type: 'panel', label: capitalizeFirstLetter(worldName), width: 20,
            elements: [
                {
                    id: 'id', attribute: 'id', type: 'text', label: 'Id',
                    maxLength: 255,
                    width: 100, inMany: true
                },
                {
                    id: 'name', attribute: 'name', type: 'text', label: 'Name', required: true,
                    maxLength: 255,
                    width: 100, inMany: true
                }
            ]
        },
        {
            type: "panel", "label": "Audit", width: 20,
            elements: [
                {
                    id: 'createdDate',
                    attribute: 'createdDate',
                    type: 'datetime',
                    label: 'Created At',
                    width: 50,
                    inMany: true
                },
                {
                    id: 'lastUpdated',
                    attribute: 'lastUpdated',
                    type: 'datetime',
                    label: 'Last updated',
                    width: 50,
                    inMany: true
                },
                {
                    id: 'createdBy',
                    attribute: 'createdBy',
                    label: "Created by",
                    witdh: 50,
                    type: 'number',
                    inMany: true
                },
                {
                    id: 'lastUpdatedBy',
                    attribute: 'lastUpdatedBy',
                    label: "Last updated by",
                    witdh: 50,
                    type: 'string',
                    inMany: true
                }

            ]
        },
        {
            type: 'panel', label: "Ownership", width: 20,
            elements: [
                {
                    id: 'permission',
                    attribute: 'permission',
                    type: "number",
                    width: 100,
                    inMany: true,
                    label: "Permission"
                },
                {
                    id: 'state_',
                    attribute: 'state_',
                    type: 'lov',
                    list: [
                        {id: 'active', text: "Active"},
                        {id: 'pending', text: "Pending"},
                        {id: 'completed', text: 'Completed'}
                    ],
                    width: 100,
                    inMany: true,
                    label: "State"
                }
            ]
        }
    ]
};