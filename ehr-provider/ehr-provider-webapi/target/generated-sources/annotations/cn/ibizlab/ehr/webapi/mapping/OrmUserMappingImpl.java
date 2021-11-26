package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmUser;
import cn.ibizlab.ehr.webapi.dto.OrmUserDTO;
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
public class OrmUserMappingImpl implements OrmUserMapping {

    @Override
    public OrmUser toDomain(OrmUserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmUser ormUser = new OrmUser();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormUser.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormUser.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getUnuserid() != null ) {
            ormUser.setUnuserid( dto.getUnuserid() );
        }
        if ( dto.getUsercode() != null ) {
            ormUser.setUsercode( dto.getUsercode() );
        }
        if ( dto.getEmpid() != null ) {
            ormUser.setEmpid( dto.getEmpid() );
        }
        if ( dto.getOrgusername() != null ) {
            ormUser.setOrgusername( dto.getOrgusername() );
        }
        if ( dto.getValidflag() != null ) {
            ormUser.setValidflag( dto.getValidflag() );
        }
        if ( dto.getMemo() != null ) {
            ormUser.setMemo( dto.getMemo() );
        }
        if ( dto.getOrguserid() != null ) {
            ormUser.setOrguserid( dto.getOrguserid() );
        }
        if ( dto.getCreateman() != null ) {
            ormUser.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormUser.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormUser.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormUser.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgname() != null ) {
            ormUser.setOrgname( dto.getOrgname() );
        }
        if ( dto.getOrgsectorname() != null ) {
            ormUser.setOrgsectorname( dto.getOrgsectorname() );
        }
        if ( dto.getOrgid() != null ) {
            ormUser.setOrgid( dto.getOrgid() );
        }
        if ( dto.getOrgsectorid() != null ) {
            ormUser.setOrgsectorid( dto.getOrgsectorid() );
        }

        return ormUser;
    }

    @Override
    public OrmUserDTO toDto(OrmUser entity) {
        if ( entity == null ) {
            return null;
        }

        OrmUserDTO ormUserDTO = new OrmUserDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormUserDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormUserDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getUnuserid() != null ) {
            ormUserDTO.setUnuserid( entity.getUnuserid() );
        }
        if ( entity.getUsercode() != null ) {
            ormUserDTO.setUsercode( entity.getUsercode() );
        }
        if ( entity.getEmpid() != null ) {
            ormUserDTO.setEmpid( entity.getEmpid() );
        }
        if ( entity.getOrgusername() != null ) {
            ormUserDTO.setOrgusername( entity.getOrgusername() );
        }
        if ( entity.getValidflag() != null ) {
            ormUserDTO.setValidflag( entity.getValidflag() );
        }
        if ( entity.getMemo() != null ) {
            ormUserDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getOrguserid() != null ) {
            ormUserDTO.setOrguserid( entity.getOrguserid() );
        }
        if ( entity.getCreateman() != null ) {
            ormUserDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormUserDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormUserDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormUserDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgname() != null ) {
            ormUserDTO.setOrgname( entity.getOrgname() );
        }
        if ( entity.getOrgsectorname() != null ) {
            ormUserDTO.setOrgsectorname( entity.getOrgsectorname() );
        }
        if ( entity.getOrgid() != null ) {
            ormUserDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getOrgsectorid() != null ) {
            ormUserDTO.setOrgsectorid( entity.getOrgsectorid() );
        }

        return ormUserDTO;
    }

    @Override
    public List<OrmUser> toDomain(List<OrmUserDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmUser> list = new ArrayList<OrmUser>( dtoList.size() );
        for ( OrmUserDTO ormUserDTO : dtoList ) {
            list.add( toDomain( ormUserDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmUserDTO> toDto(List<OrmUser> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmUserDTO> list = new ArrayList<OrmUserDTO>( entityList.size() );
        for ( OrmUser ormUser : entityList ) {
            list.add( toDto( ormUser ) );
        }

        return list;
    }
}
