package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmOrgInfo;
import cn.ibizlab.ehr.webapi.dto.OrmOrgInfoDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmOrgInfoMappingImpl implements OrmOrgInfoMapping {

    @Override
    public OrmOrgInfo toDomain(OrmOrgInfoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmOrgInfo ormOrgInfo = new OrmOrgInfo();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormOrgInfo.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormOrgInfo.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPostinfo() != null ) {
            ormOrgInfo.setPostinfo( dto.getPostinfo() );
        }
        if ( dto.getPorgsectorid() != null ) {
            ormOrgInfo.setPorgsectorid( dto.getPorgsectorid() );
        }
        if ( dto.getOrdernum() != null ) {
            ormOrgInfo.setOrdernum( dto.getOrdernum() );
        }
        if ( dto.getOuid() != null ) {
            ormOrgInfo.setOuid( dto.getOuid() );
        }
        if ( dto.getShortname() != null ) {
            ormOrgInfo.setShortname( dto.getShortname() );
        }
        if ( dto.getOrgcode() != null ) {
            ormOrgInfo.setOrgcode( dto.getOrgcode() );
        }
        if ( dto.getStartstopsign() != null ) {
            ormOrgInfo.setStartstopsign( dto.getStartstopsign() );
        }
        if ( dto.getPorgid() != null ) {
            ormOrgInfo.setPorgid( dto.getPorgid() );
        }
        if ( dto.getOrgtypename() != null ) {
            ormOrgInfo.setOrgtypename( dto.getOrgtypename() );
        }
        if ( dto.getBelongregion() != null ) {
            ormOrgInfo.setBelongregion( dto.getBelongregion() );
        }
        if ( dto.getOrgtype() != null ) {
            ormOrgInfo.setOrgtype( dto.getOrgtype() );
        }
        if ( dto.getSubstandard() != null ) {
            ormOrgInfo.setSubstandard( dto.getSubstandard() );
        }
        if ( dto.getOrmorginfoname() != null ) {
            ormOrgInfo.setOrmorginfoname( dto.getOrmorginfoname() );
        }
        if ( dto.getOrmorginfoid() != null ) {
            ormOrgInfo.setOrmorginfoid( dto.getOrmorginfoid() );
        }
        if ( dto.getCreatedate() != null ) {
            ormOrgInfo.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            ormOrgInfo.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormOrgInfo.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormOrgInfo.setUpdateman( dto.getUpdateman() );
        }

        return ormOrgInfo;
    }

    @Override
    public OrmOrgInfoDTO toDto(OrmOrgInfo entity) {
        if ( entity == null ) {
            return null;
        }

        OrmOrgInfoDTO ormOrgInfoDTO = new OrmOrgInfoDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormOrgInfoDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormOrgInfoDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPostinfo() != null ) {
            ormOrgInfoDTO.setPostinfo( entity.getPostinfo() );
        }
        if ( entity.getPorgsectorid() != null ) {
            ormOrgInfoDTO.setPorgsectorid( entity.getPorgsectorid() );
        }
        if ( entity.getOrdernum() != null ) {
            ormOrgInfoDTO.setOrdernum( entity.getOrdernum() );
        }
        if ( entity.getOuid() != null ) {
            ormOrgInfoDTO.setOuid( entity.getOuid() );
        }
        if ( entity.getShortname() != null ) {
            ormOrgInfoDTO.setShortname( entity.getShortname() );
        }
        if ( entity.getOrgcode() != null ) {
            ormOrgInfoDTO.setOrgcode( entity.getOrgcode() );
        }
        if ( entity.getStartstopsign() != null ) {
            ormOrgInfoDTO.setStartstopsign( entity.getStartstopsign() );
        }
        if ( entity.getPorgid() != null ) {
            ormOrgInfoDTO.setPorgid( entity.getPorgid() );
        }
        if ( entity.getOrgtypename() != null ) {
            ormOrgInfoDTO.setOrgtypename( entity.getOrgtypename() );
        }
        if ( entity.getBelongregion() != null ) {
            ormOrgInfoDTO.setBelongregion( entity.getBelongregion() );
        }
        if ( entity.getOrgtype() != null ) {
            ormOrgInfoDTO.setOrgtype( entity.getOrgtype() );
        }
        if ( entity.getSubstandard() != null ) {
            ormOrgInfoDTO.setSubstandard( entity.getSubstandard() );
        }
        if ( entity.getOrmorginfoname() != null ) {
            ormOrgInfoDTO.setOrmorginfoname( entity.getOrmorginfoname() );
        }
        if ( entity.getOrmorginfoid() != null ) {
            ormOrgInfoDTO.setOrmorginfoid( entity.getOrmorginfoid() );
        }
        if ( entity.getCreatedate() != null ) {
            ormOrgInfoDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            ormOrgInfoDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormOrgInfoDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormOrgInfoDTO.setUpdateman( entity.getUpdateman() );
        }

        return ormOrgInfoDTO;
    }

    @Override
    public List<OrmOrgInfo> toDomain(List<OrmOrgInfoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmOrgInfo> list = new ArrayList<OrmOrgInfo>( dtoList.size() );
        for ( OrmOrgInfoDTO ormOrgInfoDTO : dtoList ) {
            list.add( toDomain( ormOrgInfoDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmOrgInfoDTO> toDto(List<OrmOrgInfo> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmOrgInfoDTO> list = new ArrayList<OrmOrgInfoDTO>( entityList.size() );
        for ( OrmOrgInfo ormOrgInfo : entityList ) {
            list.add( toDto( ormOrgInfo ) );
        }

        return list;
    }
}
