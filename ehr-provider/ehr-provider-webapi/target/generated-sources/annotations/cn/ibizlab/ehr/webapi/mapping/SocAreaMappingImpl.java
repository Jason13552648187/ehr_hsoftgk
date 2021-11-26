package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocArea;
import cn.ibizlab.ehr.webapi.dto.SocAreaDTO;
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
    date = "2021-09-04T00:31:45+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SocAreaMappingImpl implements SocAreaMapping {

    @Override
    public SocArea toDomain(SocAreaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocArea socArea = new SocArea();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socArea.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socArea.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSocareaname() != null ) {
            socArea.setSocareaname( dto.getSocareaname() );
        }
        if ( dto.getOrmorgid() != null ) {
            socArea.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getMemo() != null ) {
            socArea.setMemo( dto.getMemo() );
        }
        if ( dto.getSocareaid() != null ) {
            socArea.setSocareaid( dto.getSocareaid() );
        }
        if ( dto.getEnable() != null ) {
            socArea.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            socArea.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            socArea.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            socArea.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            socArea.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            socArea.setOrmorgname( dto.getOrmorgname() );
        }

        return socArea;
    }

    @Override
    public SocAreaDTO toDto(SocArea entity) {
        if ( entity == null ) {
            return null;
        }

        SocAreaDTO socAreaDTO = new SocAreaDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socAreaDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socAreaDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSocareaname() != null ) {
            socAreaDTO.setSocareaname( entity.getSocareaname() );
        }
        if ( entity.getOrmorgid() != null ) {
            socAreaDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getMemo() != null ) {
            socAreaDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getSocareaid() != null ) {
            socAreaDTO.setSocareaid( entity.getSocareaid() );
        }
        if ( entity.getEnable() != null ) {
            socAreaDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            socAreaDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            socAreaDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            socAreaDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            socAreaDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            socAreaDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return socAreaDTO;
    }

    @Override
    public List<SocArea> toDomain(List<SocAreaDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocArea> list = new ArrayList<SocArea>( dtoList.size() );
        for ( SocAreaDTO socAreaDTO : dtoList ) {
            list.add( toDomain( socAreaDTO ) );
        }

        return list;
    }

    @Override
    public List<SocAreaDTO> toDto(List<SocArea> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocAreaDTO> list = new ArrayList<SocAreaDTO>( entityList.size() );
        for ( SocArea socArea : entityList ) {
            list.add( toDto( socArea ) );
        }

        return list;
    }
}
