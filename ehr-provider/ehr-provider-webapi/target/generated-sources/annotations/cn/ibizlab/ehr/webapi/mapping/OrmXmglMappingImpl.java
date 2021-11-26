package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmXmgl;
import cn.ibizlab.ehr.webapi.dto.OrmXmglDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmXmglMappingImpl implements OrmXmglMapping {

    @Override
    public OrmXmgl toDomain(OrmXmglDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmXmgl ormXmgl = new OrmXmgl();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormXmgl.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormXmgl.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getEhrOrgId() != null ) {
            ormXmgl.setEhrOrgId( dto.getEhrOrgId() );
        }
        if ( dto.getTargetFinishDate() != null ) {
            ormXmgl.setTargetFinishDate( dto.getTargetFinishDate() );
        }
        if ( dto.getIsdirectlymanage() != null ) {
            ormXmgl.setIsdirectlymanage( dto.getIsdirectlymanage() );
        }
        if ( dto.getProjectName() != null ) {
            ormXmgl.setProjectName( dto.getProjectName() );
        }
        if ( dto.getOrmxmglname() != null ) {
            ormXmgl.setOrmxmglname( dto.getOrmxmglname() );
        }
        if ( dto.getEngineeringbustype() != null ) {
            ormXmgl.setEngineeringbustype( dto.getEngineeringbustype() );
        }
        if ( dto.getProjectType() != null ) {
            ormXmgl.setProjectType( dto.getProjectType() );
        }
        if ( dto.getProjectStatusCode() != null ) {
            ormXmgl.setProjectStatusCode( dto.getProjectStatusCode() );
        }
        if ( dto.getProjectStatusName() != null ) {
            ormXmgl.setProjectStatusName( dto.getProjectStatusName() );
        }
        if ( dto.getEngineeringscale() != null ) {
            ormXmgl.setEngineeringscale( dto.getEngineeringscale() );
        }
        if ( dto.getEngineeringpurpose() != null ) {
            ormXmgl.setEngineeringpurpose( dto.getEngineeringpurpose() );
        }
        if ( dto.getProjectSize() != null ) {
            ormXmgl.setProjectSize( dto.getProjectSize() );
        }
        if ( dto.getXmbh() != null ) {
            ormXmgl.setXmbh( dto.getXmbh() );
        }
        if ( dto.getProjectFullName() != null ) {
            ormXmgl.setProjectFullName( dto.getProjectFullName() );
        }
        if ( dto.getOrgId() != null ) {
            ormXmgl.setOrgId( dto.getOrgId() );
        }
        if ( dto.getProcapitalatt() != null ) {
            ormXmgl.setProcapitalatt( dto.getProcapitalatt() );
        }
        if ( dto.getProjectNumber() != null ) {
            ormXmgl.setProjectNumber( dto.getProjectNumber() );
        }
        if ( dto.getTargetStartDate() != null ) {
            ormXmgl.setTargetStartDate( dto.getTargetStartDate() );
        }
        if ( dto.getCreatedate() != null ) {
            ormXmgl.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormXmgl.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmxmglid() != null ) {
            ormXmgl.setOrmxmglid( dto.getOrmxmglid() );
        }
        if ( dto.getCreateman() != null ) {
            ormXmgl.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormXmgl.setUpdatedate( dto.getUpdatedate() );
        }

        return ormXmgl;
    }

    @Override
    public OrmXmglDTO toDto(OrmXmgl entity) {
        if ( entity == null ) {
            return null;
        }

        OrmXmglDTO ormXmglDTO = new OrmXmglDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormXmglDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormXmglDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getEhrOrgId() != null ) {
            ormXmglDTO.setEhrOrgId( entity.getEhrOrgId() );
        }
        if ( entity.getTargetFinishDate() != null ) {
            ormXmglDTO.setTargetFinishDate( entity.getTargetFinishDate() );
        }
        if ( entity.getIsdirectlymanage() != null ) {
            ormXmglDTO.setIsdirectlymanage( entity.getIsdirectlymanage() );
        }
        if ( entity.getProjectName() != null ) {
            ormXmglDTO.setProjectName( entity.getProjectName() );
        }
        if ( entity.getOrmxmglname() != null ) {
            ormXmglDTO.setOrmxmglname( entity.getOrmxmglname() );
        }
        if ( entity.getEngineeringbustype() != null ) {
            ormXmglDTO.setEngineeringbustype( entity.getEngineeringbustype() );
        }
        if ( entity.getProjectType() != null ) {
            ormXmglDTO.setProjectType( entity.getProjectType() );
        }
        if ( entity.getProjectStatusCode() != null ) {
            ormXmglDTO.setProjectStatusCode( entity.getProjectStatusCode() );
        }
        if ( entity.getProjectStatusName() != null ) {
            ormXmglDTO.setProjectStatusName( entity.getProjectStatusName() );
        }
        if ( entity.getEngineeringscale() != null ) {
            ormXmglDTO.setEngineeringscale( entity.getEngineeringscale() );
        }
        if ( entity.getEngineeringpurpose() != null ) {
            ormXmglDTO.setEngineeringpurpose( entity.getEngineeringpurpose() );
        }
        if ( entity.getProjectSize() != null ) {
            ormXmglDTO.setProjectSize( entity.getProjectSize() );
        }
        if ( entity.getXmbh() != null ) {
            ormXmglDTO.setXmbh( entity.getXmbh() );
        }
        if ( entity.getProjectFullName() != null ) {
            ormXmglDTO.setProjectFullName( entity.getProjectFullName() );
        }
        if ( entity.getOrgId() != null ) {
            ormXmglDTO.setOrgId( entity.getOrgId() );
        }
        if ( entity.getProcapitalatt() != null ) {
            ormXmglDTO.setProcapitalatt( entity.getProcapitalatt() );
        }
        if ( entity.getProjectNumber() != null ) {
            ormXmglDTO.setProjectNumber( entity.getProjectNumber() );
        }
        if ( entity.getTargetStartDate() != null ) {
            ormXmglDTO.setTargetStartDate( entity.getTargetStartDate() );
        }
        if ( entity.getCreatedate() != null ) {
            ormXmglDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormXmglDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmxmglid() != null ) {
            ormXmglDTO.setOrmxmglid( entity.getOrmxmglid() );
        }
        if ( entity.getCreateman() != null ) {
            ormXmglDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormXmglDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return ormXmglDTO;
    }

    @Override
    public List<OrmXmgl> toDomain(List<OrmXmglDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmXmgl> list = new ArrayList<OrmXmgl>( dtoList.size() );
        for ( OrmXmglDTO ormXmglDTO : dtoList ) {
            list.add( toDomain( ormXmglDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmXmglDTO> toDto(List<OrmXmgl> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmXmglDTO> list = new ArrayList<OrmXmglDTO>( entityList.size() );
        for ( OrmXmgl ormXmgl : entityList ) {
            list.add( toDto( ormXmgl ) );
        }

        return list;
    }
}
