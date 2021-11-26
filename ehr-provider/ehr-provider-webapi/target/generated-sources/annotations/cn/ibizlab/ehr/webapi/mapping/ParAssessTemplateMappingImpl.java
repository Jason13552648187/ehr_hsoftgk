package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParAssessTemplate;
import cn.ibizlab.ehr.webapi.dto.ParAssessTemplateDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParAssessTemplateMappingImpl implements ParAssessTemplateMapping {

    @Override
    public ParAssessTemplate toDomain(ParAssessTemplateDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParAssessTemplate parAssessTemplate = new ParAssessTemplate();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parAssessTemplate.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parAssessTemplate.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getParassesstemplatename() != null ) {
            parAssessTemplate.setParassesstemplatename( dto.getParassesstemplatename() );
        }
        if ( dto.getNd() != null ) {
            parAssessTemplate.setNd( dto.getNd() );
        }
        if ( dto.getKhdx() != null ) {
            parAssessTemplate.setKhdx( dto.getKhdx() );
        }
        if ( dto.getSfyx() != null ) {
            parAssessTemplate.setSfyx( dto.getSfyx() );
        }
        if ( dto.getParassesstemplateid() != null ) {
            parAssessTemplate.setParassesstemplateid( dto.getParassesstemplateid() );
        }
        if ( dto.getCreateman() != null ) {
            parAssessTemplate.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            parAssessTemplate.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parAssessTemplate.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            parAssessTemplate.setUpdatedate( dto.getUpdatedate() );
        }

        return parAssessTemplate;
    }

    @Override
    public ParAssessTemplateDTO toDto(ParAssessTemplate entity) {
        if ( entity == null ) {
            return null;
        }

        ParAssessTemplateDTO parAssessTemplateDTO = new ParAssessTemplateDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parAssessTemplateDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parAssessTemplateDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getParassesstemplatename() != null ) {
            parAssessTemplateDTO.setParassesstemplatename( entity.getParassesstemplatename() );
        }
        if ( entity.getNd() != null ) {
            parAssessTemplateDTO.setNd( entity.getNd() );
        }
        if ( entity.getKhdx() != null ) {
            parAssessTemplateDTO.setKhdx( entity.getKhdx() );
        }
        if ( entity.getSfyx() != null ) {
            parAssessTemplateDTO.setSfyx( entity.getSfyx() );
        }
        if ( entity.getParassesstemplateid() != null ) {
            parAssessTemplateDTO.setParassesstemplateid( entity.getParassesstemplateid() );
        }
        if ( entity.getCreateman() != null ) {
            parAssessTemplateDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            parAssessTemplateDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parAssessTemplateDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            parAssessTemplateDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return parAssessTemplateDTO;
    }

    @Override
    public List<ParAssessTemplate> toDomain(List<ParAssessTemplateDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParAssessTemplate> list = new ArrayList<ParAssessTemplate>( dtoList.size() );
        for ( ParAssessTemplateDTO parAssessTemplateDTO : dtoList ) {
            list.add( toDomain( parAssessTemplateDTO ) );
        }

        return list;
    }

    @Override
    public List<ParAssessTemplateDTO> toDto(List<ParAssessTemplate> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParAssessTemplateDTO> list = new ArrayList<ParAssessTemplateDTO>( entityList.size() );
        for ( ParAssessTemplate parAssessTemplate : entityList ) {
            list.add( toDto( parAssessTemplate ) );
        }

        return list;
    }
}
