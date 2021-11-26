package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParExamContent;
import cn.ibizlab.ehr.webapi.dto.ParExamContentDTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParExamContentMappingImpl implements ParExamContentMapping {

    @Override
    public ParExamContent toDomain(ParExamContentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParExamContent parExamContent = new ParExamContent();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parExamContent.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parExamContent.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getParexamcontentname() != null ) {
            parExamContent.setParexamcontentname( dto.getParexamcontentname() );
        }
        if ( dto.getContentcode() != null ) {
            parExamContent.setContentcode( dto.getContentcode() );
        }
        if ( dto.getParexamcontentid() != null ) {
            parExamContent.setParexamcontentid( dto.getParexamcontentid() );
        }
        if ( dto.getCreateman() != null ) {
            parExamContent.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            parExamContent.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parExamContent.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            parExamContent.setUpdatedate( dto.getUpdatedate() );
        }

        return parExamContent;
    }

    @Override
    public ParExamContentDTO toDto(ParExamContent entity) {
        if ( entity == null ) {
            return null;
        }

        ParExamContentDTO parExamContentDTO = new ParExamContentDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parExamContentDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parExamContentDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getParexamcontentname() != null ) {
            parExamContentDTO.setParexamcontentname( entity.getParexamcontentname() );
        }
        if ( entity.getContentcode() != null ) {
            parExamContentDTO.setContentcode( entity.getContentcode() );
        }
        if ( entity.getParexamcontentid() != null ) {
            parExamContentDTO.setParexamcontentid( entity.getParexamcontentid() );
        }
        if ( entity.getCreateman() != null ) {
            parExamContentDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            parExamContentDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parExamContentDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            parExamContentDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return parExamContentDTO;
    }

    @Override
    public List<ParExamContent> toDomain(List<ParExamContentDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParExamContent> list = new ArrayList<ParExamContent>( dtoList.size() );
        for ( ParExamContentDTO parExamContentDTO : dtoList ) {
            list.add( toDomain( parExamContentDTO ) );
        }

        return list;
    }

    @Override
    public List<ParExamContentDTO> toDto(List<ParExamContent> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParExamContentDTO> list = new ArrayList<ParExamContentDTO>( entityList.size() );
        for ( ParExamContent parExamContent : entityList ) {
            list.add( toDto( parExamContent ) );
        }

        return list;
    }
}
