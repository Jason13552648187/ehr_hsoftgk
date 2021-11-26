package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocCompanyWel;
import cn.ibizlab.ehr.webapi.dto.SocCompanyWelDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SocCompanyWelMappingImpl implements SocCompanyWelMapping {

    @Override
    public SocCompanyWel toDomain(SocCompanyWelDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocCompanyWel socCompanyWel = new SocCompanyWel();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socCompanyWel.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socCompanyWel.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSoccompanywelname() != null ) {
            socCompanyWel.setSoccompanywelname( dto.getSoccompanywelname() );
        }
        if ( dto.getOrmorgid() != null ) {
            socCompanyWel.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getSocselfarebaseid() != null ) {
            socCompanyWel.setSocselfarebaseid( dto.getSocselfarebaseid() );
        }
        if ( dto.getEnable() != null ) {
            socCompanyWel.setEnable( dto.getEnable() );
        }
        if ( dto.getSoccompanywelid() != null ) {
            socCompanyWel.setSoccompanywelid( dto.getSoccompanywelid() );
        }
        if ( dto.getOrgid() != null ) {
            socCompanyWel.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            socCompanyWel.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            socCompanyWel.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            socCompanyWel.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            socCompanyWel.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            socCompanyWel.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getSocselfarebasename() != null ) {
            socCompanyWel.setSocselfarebasename( dto.getSocselfarebasename() );
        }

        return socCompanyWel;
    }

    @Override
    public SocCompanyWelDTO toDto(SocCompanyWel entity) {
        if ( entity == null ) {
            return null;
        }

        SocCompanyWelDTO socCompanyWelDTO = new SocCompanyWelDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socCompanyWelDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socCompanyWelDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSoccompanywelname() != null ) {
            socCompanyWelDTO.setSoccompanywelname( entity.getSoccompanywelname() );
        }
        if ( entity.getOrmorgid() != null ) {
            socCompanyWelDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getSocselfarebaseid() != null ) {
            socCompanyWelDTO.setSocselfarebaseid( entity.getSocselfarebaseid() );
        }
        if ( entity.getEnable() != null ) {
            socCompanyWelDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getSoccompanywelid() != null ) {
            socCompanyWelDTO.setSoccompanywelid( entity.getSoccompanywelid() );
        }
        if ( entity.getOrgid() != null ) {
            socCompanyWelDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            socCompanyWelDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            socCompanyWelDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            socCompanyWelDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            socCompanyWelDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            socCompanyWelDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getSocselfarebasename() != null ) {
            socCompanyWelDTO.setSocselfarebasename( entity.getSocselfarebasename() );
        }

        return socCompanyWelDTO;
    }

    @Override
    public List<SocCompanyWel> toDomain(List<SocCompanyWelDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocCompanyWel> list = new ArrayList<SocCompanyWel>( dtoList.size() );
        for ( SocCompanyWelDTO socCompanyWelDTO : dtoList ) {
            list.add( toDomain( socCompanyWelDTO ) );
        }

        return list;
    }

    @Override
    public List<SocCompanyWelDTO> toDto(List<SocCompanyWel> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocCompanyWelDTO> list = new ArrayList<SocCompanyWelDTO>( entityList.size() );
        for ( SocCompanyWel socCompanyWel : entityList ) {
            list.add( toDto( socCompanyWel ) );
        }

        return list;
    }
}
